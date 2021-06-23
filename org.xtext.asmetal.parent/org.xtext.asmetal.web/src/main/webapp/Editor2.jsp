<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Language" content="en-us">
<title>Web Editor for Asmeta</title>
<link rel="stylesheet" type="text/css"
	href="xtext/2.26.0-SNAPSHOT/xtext-ace.css" />
<link rel="stylesheet" type="text/css" href="style.css" />
<script src="webjars/requirejs/2.3.6/require.min.js"></script>
<script type="text/javascript">
	var baseUrl = window.location.pathname;
	var fileIndex = baseUrl.indexOf("Editor2.jsp");
	if (fileIndex > 0)
		baseUrl = baseUrl.slice(0, fileIndex);
	require
			.config({
				baseUrl : baseUrl,
				paths : {
					"jquery" : "webjars/jquery/3.6.0/jquery.min",
					"ace/ext/language_tools" : "webjars/ace/1.3.3/src/ext-language_tools",
					"xtext/xtext-ace" : "xtext/2.26.0-SNAPSHOT/xtext-ace"
				}
			});
	require([ "webjars/ace/1.3.3/src/ace" ], function() {
		require([ "xtext/xtext-ace" ], function(xtext) {
			xtext.createEditor({
				baseUrl : baseUrl,
				syntaxDefinition : "xtext-resources/generated/mode-asm"
			});
		});
	});
</script>
</head>
<body>

	<div class="container">
		<div class="header">
			<h1>AsmetaL Web Editor</h1>
		</div>
		<div class="content">
			<div id="xtext-editor" data-editor-xtext-lang="asm"></div>
		</div>
	</div>
	<div class="run">
		<button onclick="parse()">Run</button>
		<script language="JavaScript">
			function parse() {
				document.getElementById("result").innerHTML = "parsing";
				var xhttp = new XMLHttpRequest();
				xhttp.onreadystatechange = function() {
					if (this.readyState == 4 && this.status == 200) {
						document.getElementById("result").innerHTML = this.responseText;
					}
				};
				//document.formname.key.value = "asm AdvancedClock ";
				//document.formname.submit();
				var params = 'key=gg';
				xhttp.open("POST", "EditorServlet", true);
				xhttp.send(params);
			}
		</script>
		<h1>Risultato:</h1>
		${dato}
		<!--  where to show the result -->
		<div id="result"></div>
	</div>
</body>
</html>