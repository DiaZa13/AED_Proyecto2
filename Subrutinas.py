from py2neo import *
graph = Graph("bolt://localhost:7687", user="neo4j", password="password")

def agregarNodo(restaurante,direccion,nombre,graph):
    tx = graph.begin()
    query = """
    CREATE (%s:Restaurant{name: "%s", address:"%s"})
    """ %(restaurante,nombre,direccion)
    data = graph.run(query)
    print ("Se logro agregar el nodo con exito")
    
def eliminarNodo(restaurante,nombre, direccion,graph):
    tx = graph.begin()
    try:
        query = """
        MATCH (%s:Restaurant{name: "%s", address:"%s"}) 
        DELETE %s
        """ %(restaurante,nombre,direccion,restaurante)
        data = graph.run(query)
        print ("Se logro eliminar el nodo")
    except:
        print ("No se logro eliminar el nodo")


    def create_or_fail(graph_db, start_node, end_node, relationship):
    if len(list(graph_db.match(start_node=start_node, end_node=end_node, rel_type=relationship))) > 0:
        print ("Relationship already exists")
        return None
    return graph_db.create((start_node, relationship, end_node))

