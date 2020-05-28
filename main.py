import sys
from Subrutinas import *
n =0
print("_________________________________________________________________________________________")
print("888888b.   d8b                                              d8b      888")          
print("888   88b  Y8P                                              Y8P      888")         
print("888  .88P                                                            888")          
print("8888888K.  888  .d88b.  88888b.  888  888  .d88b.  88888b.  888  .d88888  .d88b.")  
print("888   8888 888 d8P  Y8b 888  88b 888  888 d8P  Y8b 888  88b 888 d88  888 d88""88b.") 
print("888    888 888 88888888 888  888 Y88  88P 88888888 888  888 888 888  888 888  888.") 
print("888   d88P 888 Y8b.     888  888  Y8bd8P  Y8b.     888  888 888 Y88b 888 Y88..88P.") 
print("8888888P   888   Y8888  888  888   Y88P     Y8888  888  888 888   Y88888   Y88P.")  
print("_________________________________________________________________________________________")
print("Este programa tiene como finalidad ofrecer una recomendacion en base a lo que usted desea")
print("Especificamente en restaurantes, sin mas que agregar, ya puede usar el programa :) ")
print("____________________________________________________________________________________________________")
print("PARA INICIAR EL PROGRAMA, POR FAVOR SELECCIONE UNA DE LAS OPCIONES QUE SE PRESENTAN A CONTINUACION")
print("____________________________________________________________________________________________________")

while n < 4:    

while n < 5:    
>>>>>>> Stashed changes
    print ("1. Encontrar una recomendacion")
    print ("2. Agregar nueva informacion al programa")
    print ("3. Eliminar datos que no desea en el programa")
    print ("4. Salir")
    
    try:
        n = int (input())
    except:
        print("Ingrese un valor valido")
    if n == 1:
        print("Ingresar aqui la funcion de mostrar recomendacion")
    if n == 2:
        print("Ingresar el restaurante")
        restaurante = input()
        print ("Ingresar el nombre del restaurante")
        nombre = input()
        print("Ingresar la direccion del restaurante")
        direccion = input()
        
        addNewnode(restaurante,direccion,nombre,graph)
    if n == 3:
        print("Ingresar el restaurante al que desea eliminar")
        restaurante = input()
        print ("Ingresar el nombre del restaurante que desea eliminar")
        nombre = input()
        print("Ingresar la direccion del restaurante eliminar")
        direccion = input()
         
        deleteNode(restaurante,nombre,direccion,graph)
    if n == 4:
        print("Nos apena que quieras salir del programa :(")
        print("En todo caso, esperamos que te haya sido de utilidad :)")
        print("888")                        
        print("888")                       
        print("888")                        
        print("88888b   888  888  .d88b.")  
        print("888  88b 888  888 d8P  Y8b") 
        print("888  888 888  888 88888888") 
        print("888 d88P Y88b 888 Y8b.")     
        print("88888P    Y88888  Y8888")  
        print("             888")          
        print("        Y8b d88P  ")        
        print("          Y88P  ")
        sys.exit()
        
   


 
