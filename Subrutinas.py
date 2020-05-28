from py2neo import *
def agregarNodo(restaurante,direccion,nombre):
    graph = Graph("bolt://localhost:7687", user="neo4j", password="password")
    tx = graph.begin()
    query = """
    CREATE (%s:Restaurant{name: "%s", address:"%s"})
    """ %(restaurante,nombre,direccion)
    data = graph.run(query)
    print ("Se logro agregar el nodo con exito") 