REM click droit open with text editor pour saisir contenu .bat sous eclipse
REM click droit open with system editor pour lancer l'execution

CD /d "%~dp0"
set WSDL_URL=http://192.168.56.1:7979/SOA/ConvertisseurImpl?wsdl

wsimport -keep -d ./main/java %WSDL_URL%

REM le serveur doit etre demarre pour que ?wsdl soit accesible
REM effectuer un refresh sous eclipse sue le project clientWS

pause