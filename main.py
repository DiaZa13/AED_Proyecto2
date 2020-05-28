n =0
while n < 4:    
    print ("Bienvenido a la aplicacion -----")
    print ("¿Que desea hace?")
    print ("1.Buscar una recomendacion")
    print ("2.Agregar nueva informacion al programa")
    print ("3.Eliminar algun dato")
    print ("4.Salir")
    try:
        n = int (input())
    except:
        print("Ingrese un valor valido")
    if n == 1:
        print("Ingresar aqui la funcion de mostrar recomendacion")
    if n == 2:
        print("Ingresar aqui la funcion de agregar un nodo")
    if n == 3:
        print("Ingresar aqui la funcion de eliminar un nodo")
    
        