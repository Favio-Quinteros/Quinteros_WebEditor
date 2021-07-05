/**
 * 
 */
function esegui(){
		var cod = document.getElementById("xtext-editor").innerHTML;
		var tes = cod.toString();
		var cut = tes.substring(500,tes.length);
		var counter = 0;
		var testo = "";
		var fine = 0;
		var aum = 0;
		const inizio = "<div class=\"ace_line\" style=\"height:14px\">";
		const acapo = "</div><div class=\"ace_line\" style=\"height:14px\">";
		const chiudi = "</div></div><div class=\"ace_layer ace_marker-layer\">";
		const pChiave = "<span class=\"ace_keyword\">";
		const spChiave = "</span>";
		const num = "<span class=\"ace_constant ace_numeric\">";
		const str = "<span class=\"ace_string\">";
		const tab = "<span class=\"ace_indent-guide\">";
		const comm = "<span class=\"ace_comment\">";
		const mag = "&gt;";
		const min = "&lt;";
		var compare = cut.substring(counter,counter+42);
		while(!(compare==inizio)&&counter<cut.length){ 
			counter++;
			while(cut.charAt(counter)!="<"&&counter<cut.length){
				counter++;
				}
			compare = cut.substring(counter,counter+42);
		}
		fine = counter + 42;
		counter = counter + 42;
		while (!(cut.substring(fine,fine+52)==chiudi)){
			if(cut.substring(fine,fine+48)==acapo){
				testo = testo.concat(cut.substring(counter,fine),"\n");
				counter = fine + 48;
				fine = fine + 48;
				}
			else{
				if(cut.substring(fine,fine+26)==pChiave||cut.substring(fine,fine+26)==comm) aum = 26;
				else 
					if(cut.substring(fine,fine+7)==spChiave) aum = 7;
					else 
						if(cut.substring(fine,fine+39)==num) aum = 39;
						else
							if(cut.substring(fine,fine+25)==str) aum = 25;
							else 
								if(cut.substring(fine,fine+31)==tab) aum = 31;
								else fine++;
			testo = testo.concat(cut.substring(counter,fine));
			counter = fine + aum;
			fine = fine + aum;
			}
		while(cut.charAt(fine)!="<"){
			fine++;
			}
		}
		testo = testo.concat(cut.substring(counter,fine));
		tes = "";
		counter = 0;
		fine = 0;
		while(counter<testo.length){
			while((testo.charAt(counter))!="&"&&(counter<testo.length)){
				counter++;
			}
			if((testo.substring(counter,counter+4))==mag||(testo.substring(counter,counter+4)==min)){
				tes = tes.concat(testo.substring(fine,counter));
				if(testo.charAt(counter+1)=="g") tes = tes.concat(">");
				else tes = tes.concat("<");
				fine = counter + 4;
				counter = counter + 4;
			}
			else counter++;
		}
		tes = tes.concat(testo.substring(fine,counter));
		document.formname.key.value = tes;
		document.formname.submit();
	}
function getCookie(name) {
  const value = `; ${document.cookie}`;
  const parts = value.split(`; ${name}=`);
  if (parts.length === 2){  //in origine    return parts.pop().split(';').shift(); e basta
	var cookiesString = parts.pop().split(';').shift();
    var counter = 0;
    var risultato = "";
    while (counter<cookiesString.length){
    	if(cookiesString.charAt(counter)=="+") risultato = risultato + " ";
    	else risultato = risultato + cookiesString.charAt(counter);
    	counter ++;
   		}
   return decodeURIComponent(risultato);
	}
	else return"";
}
function minmagHtml(testo){
	var counter = 0;
    var risultato = "";
    while (counter<testo.length){
    	if(testo.charAt(counter)=="<") risultato = risultato + "&lt;";
		else if (testo.charAt(counter)==">") risultato = risultato + "&gt;";
			else risultato = risultato + testo.charAt(counter);
		counter++;
   		}
	return risultato;
}
