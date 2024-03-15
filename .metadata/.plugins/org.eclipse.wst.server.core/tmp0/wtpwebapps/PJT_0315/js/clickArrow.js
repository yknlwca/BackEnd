// clickArrowLeft 요소 가져오기
const clickArrowLeft = document.querySelector('#goRightArrow');
var getVideoNumber = 0;
// JSON 데이터를 가져오는 함수
async function fetchVideoData(url) {
	const response = await fetch(url);
	const data = await response.json();
	return data;
}

clickArrowLeft.addEventListener('click', () => {
	// 알람 울리기
	const videoData = fetchVideoData('/PJT_0315/src/main/webapp/data/video.json')
		.then(data => {
			const slideDivs = document.querySelectorAll('.silde');
			slideDivs.forEach(div => {

				const firstVideo = data[getVideoNumber++]; // 첫 번째 데이터 가져오기
				// div 안의 요소들 선택
				const iframe = div.querySelector('iframe');
				const titleLink = div.querySelector('._name a');
				const partSpan = div.querySelector('.where span');

				var title = data[getVideoNumber].title.length > 25 ? data[getVideoNumber].title.substring(0, 24) + "..." : data[getVideoNumber].title;

				// video 객체에서 해당하는 정보 가져오기 (여기서는 가정으로 임시 값 사용)
				const video = {
					url: data[getVideoNumber].url,
					title: title,
					part: data[getVideoNumber].part
				};

				// 해당하는 정보로 내용 변경
				iframe.src = video.url;
				titleLink.textContent = video.title;
				titleLink.href = '새로운 href 값'; // 새로운 href 값 설정 필요
				partSpan.textContent = video.part;
				if (getVideoNumber == 7) {
					getVideoNumber = 0;
				}
			});

			getVideoNumber--;

		})


});

document.querySelector('.goLeftArrow').addEventListener('click', () => {
	// 알람 울리기
	const videoData = fetchVideoData('/PJT_0315/src/main/webapp/data/video.json')
		.then(data => {
			const slideDivs = document.querySelectorAll('.silde');
			slideDivs.forEach(div => {

				const firstVideo = data[getVideoNumber--]; // 첫 번째 데이터 가져오기
				// div 안의 요소들 선택
				const iframe = div.querySelector('iframe');
				const titleLink = div.querySelector('._name a');
				const partSpan = div.querySelector('.where span');

				var title = data[getVideoNumber].title.length > 25 ? data[getVideoNumber].title.substring(0, 24) + "..." : data[getVideoNumber].title;

				// video 객체에서 해당하는 정보 가져오기 (여기서는 가정으로 임시 값 사용)
				const video = {
					url: data[getVideoNumber].url,
					title: title,
					part: data[getVideoNumber].part
				};

				// 해당하는 정보로 내용 변경
				iframe.src = video.url;
				titleLink.textContent = video.title;
				titleLink.href = '새로운 href 값'; // 새로운 href 값 설정 필요
				partSpan.textContent = video.part;
				if (getVideoNumber == 0) {
					getVideoNumber = 7;
				}
			});

			getVideoNumber++;

		})


});