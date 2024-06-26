# Freemarker  

## 1. Apache FreeMarker
Apache Freemarker는 템플릿 엔진이다. 템플릿 및 변경 데이터를 기반으로 텍스트 출력(HTML 웹 페이지, 전자 메일, 구성 파일, 소스 코드 등)을 생성하는 Java 라이브러리다. 

## 2. Template + data-model = output  

| Template
```html
<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  <h1>Welcome ${user}!</h1>
  <p>Our latest product:
  <a href="${latestProduct.url}">${latestProduct.name}</a>!
</body>
</html>
```  
| data-model
```html
<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  <h1>Welcome John Doe!</h1>
  <p>Our latest product:
  <a href="products/greenmouse.html">green mouse</a>!
</body>
</html>
```
## References
- [freemarker.apache.org](https://freemarker.apache.org/docs/dgui_quickstart.html)  
- [Freemarker 정리](https://blog.naver.com/cana01/221460866010)