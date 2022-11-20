## Activitat MP3-UF5-Ex53 Execeptions

1. Crear els següents tipus d'Exceptions
   1. Crear la classe(Exception) BankAccountException per gestionar les exceptions relacionades amb operacions bancàries.
   2. Crear la classe(Exception) ClientAccountException per gestionar les exceptions relacionades directament amb dades del client.
   
2. Exceptions que cal gestionar
   1. Cal llançar una excepció si en l'alta d'un client el DNI és incorrecte
   2. Si hi ha una operació que pot fer que un compte quedi en negatiu cal llançar una excepció
   3. Un compte corrent ha de tenir com a mínim un client associat.   
    Si s'intenta eliminar un client d'un compte i és l'últim, cal llançar una excepció, perquè sinó quedaria el compte sense client.
   
3. Usa els missatges de la classe ExceptionMessage i afegeix-ne de nous missatges si ho creus necessari

4. Implementa
   1. Un programa (main) per comprovar el bon funcionament de les excepcions que has creat, amb els exemples que creguis convenients per
   posar a prova el llançament i la captura de les excepcions.
