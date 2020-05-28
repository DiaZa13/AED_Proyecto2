from py2neo import *
def agregarNodo(restaurante,direccion,nombre,graph):
    tx = graph.begin()
    query = """
    CREATE (%s:Restaurant{name: "%s", address:"%s"})
    """ %(restaurante,nombre,direccion)
    data = graph.run(query)
    print ("Se logro agregar el nodo con exito") 