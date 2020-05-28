from py2neo import *
graph = Graph("bolt://localhost:7687", user="neo4j", password="1234")

#Adds a new restaurant to the database
def addNewnode(restaurante,direccion,nombre,graph):
    tx = graph.begin()
    query = """
    CREATE (%s:Restaurant{name: "%s", address:"%s"})
    """ %(restaurante,nombre,direccion)
    data = graph.run(query)
    print ("Se logro agregar el nodo con exito")
 
#Delete an existing restaurant in the database
def deleteNode(restaurante,nombre, direccion,graph):
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

#Look for a restaurant depending the zone
def searchRestaurantbyZone(zone):
    zoneRestaurants = []
    if zone == 1:
        query = """
        MATCH (restaurante)-[:Ubicado_En]-> (Zone {name: "Zona 9"})
        RETURN restaurante.name
        """
    if zone == 2:
        query = """
        MATCH (restaurante)-[:Ubicado_En]-> (Zone {name: "Zona 10"})
        RETURN restaurante.name
        """
    if zone == 3:
        query = """
        MATCH (restaurante)-[:Ubicado_En]-> (Zone {name: "Zona 15"})
        RETURN restaurante.name
        """
    restaurants = graph.run(query).data()
    for restaurant in restaurants:
        zoneRestaurants.append(restaurant)
        
    return zoneRestaurants


    def create_or_fail(graph_db, start_node, end_node, relationship):
        if len(list(graph_db.match(start_node=start_node, end_node=end_node, rel_type=relationship))) > 0:
            print ("Relationship already exists")
            return None
        return graph_db.create((start_node, relationship, end_node))



