<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Language" content="en-us">
	<title>Web Editor for Asmeta</title>
	<link rel="stylesheet" type="text/css" href="xtext/2.26.0-SNAPSHOT/xtext-ace.css"/>
	<link rel="stylesheet" type="text/css" href="style.css"/>
	<script type = "text/javascript" src="esegui.js"></script> 
	<script src="webjars/requirejs/2.3.6/require.min.js"></script>
	<script type="text/javascript">
		var baseUrl = window.location.pathname;
//aggiornare nome al parametro passato se si cambia il nome della jsp
		var fileIndex = baseUrl.indexOf("Editor.jsp");
		if (fileIndex > 0)
			baseUrl = baseUrl.slice(0, fileIndex);
		require.config({
			baseUrl: baseUrl,
			paths: {
				"jquery": "webjars/jquery/3.6.0/jquery.min",
				"ace/ext/language_tools": "webjars/ace/1.3.3/src/ext-language_tools",
				"xtext/xtext-ace": "xtext/2.26.0-SNAPSHOT/xtext-ace"
			}
		});
		require(["webjars/ace/1.3.3/src/ace"], function() {
			require(["xtext/xtext-ace"], function(xtext) {
				xtext.createEditor({
					baseUrl: baseUrl,
					syntaxDefinition: "xtext-resources/generated/mode-asm"
				});
			});
		});
	</script>
	<script>
	/*
	codice che recupera i cookie salvati precedentemente dalla servlet
	*/
window.onload = function(){
    document.getElementById("myText").innerHTML = minmagHtml(getCookie("cookie"));
    document.getElementById("out").innerHTML = minmagHtml(getCookie("cookie2"));
    var today = new Date();
    var giorno = today.getDate();
    var mese = today.getMonth()+1;
    var minuti = today.getMinutes();
    var ora = today.getHours();
    if(giorno<10) giorno="0"+giorno;
    if(mese<10) mese="0"+mese;
    if(minuti<10) minuti="0"+minuti;
    if(ora<10) ora="0"+ora;
    var tempo = "["+giorno+'/'+mese+'/'+today.getFullYear()+"  "+ora + ":" +minuti+"]";
    document.getElementById("tempo").innerHTML = tempo;
}
</script>
</head>
<body>
<div class="container">
	<div class="header">
		<h1>Asmeta Web Editor</h1>  <!-- titolo -->
	</div>
	<!-- parte dell'editor -->
	<div class="content"><div id="xtext-editor" data-editor-xtext-lang="asm"><span id="myText"></span></div></div>
</div>
<div id="titolo_console"><h1>Console:</h1></div>
<!-- box della console-->
<div id="secontainer"><h5><span id="tempo"></span>
 <span id="out" style="font-family:Courier"></span></h5></div>

<!-- bottone -->
<div class="run">
	<button onclick="esegui()"><img src="run_asm_web.gif" /></button>
</div>


<!-- parte che collega alla servlet -->
<form name="formname" action="EditorServlet" method="post">
    <input type="hidden" name="key">
</form>

</body>
</html>