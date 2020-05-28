from py2neo import *
from Subrutinas import *
n =0
while n < 4:    
    print ("Bienvenido a la aplicacion -----( ͡❛ ͜ʖ ͡❛)")
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
        print("Ingresar el restaurante")
        restaurante = input()
        print ("Ingresar el nombre del restaurante")
        nombre = input()
        print("Ingresar la direccion del restaurante")
        direccion = input()
        
        agregarNodo(restaurante,direccion,nombre)
    if n == 3:
        print("Ingresar aqui la funcion de eliminar un nodo")
    
graph = Graph("bolt://localhost:7687", user="neo4j", password="password")
def create_or_fail(graph_db, start_node, end_node, relationship):
    if len(list(graph_db.match(start_node=start_node, end_node=end_node, rel_type=relationship))) > 0:
        print ("Relationship already exists")
        return None
    return graph_db.create((start_node, relationship, end_node))
query = """
MATCH (restaurante)-[:Ubicado_En]-> (Zone {name: "Zona 9"})
RETURN restaurante.name
"""
data = graph.run(query).data()
for d in data:
    print (d)


 
