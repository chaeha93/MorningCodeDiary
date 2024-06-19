# summernote

## 1. summernote-lite
- Bootstrap 없이 summernote 사용 가능  
```javascript
  <script src="./summernote-lite.js"></script>
  <script src="./lang/summernote-ko-KR.js"></script>
  <link rel="stylesheet" href="./summernote-lite.css">
```  

- callback 함수를 통해 사이즈가 초과된 그림 삽입 건에 대해서는 alert 출력
```javascript
 callbacks : {
    ...
    onImageUpload: function (files) {
        var maxSize = 1 * 1024 * 1024; // limit = 1MB
        var isMaxSize = false;
        var maxFile = null;

        for (var i = 0; i < files.length; i++) {
            if (files[i].size > maxSize) {
                isMaxSize = true;
                maxFile = files[i].name;
                break;
            }
        }
        if (isMaxSize) { // 사이즈 제한에 걸렸을 때
            alert('[' + maxFile + '] 파일이 업로드 용량(1MB)을 초과하였습니다.');
            return;
        } else {
            for (var i = 0; i < files.length; i++) {
                var formData = new FormData();
                formData.append("file", files[i]);
                $('#summernote').summernote('insertImage', URL.createObjectURL(files[i]));
            }
        }
    }
}
```
## summernote-lite Demo
![Summernote_gif.gif](../img/Summernote_gif.gif)  

## References
- [summernote.org](https://summernote.org/getting-started/#basic-api)
- [Summernote 사용법1 , 설정하기](https://velog.io/@rhdguswlx/Summernote-%EC%82%AC%EC%9A%A9%EB%B2%95-%EC%8D%B8%EB%A8%B8%EB%85%B8%ED%8A%B8-%EC%82%AC%EC%9A%A9%EB%B2%95)
- [썸모노트 에디터에 업로드한 이미지를...](https://mabb.tistory.com/302)