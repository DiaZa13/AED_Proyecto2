from py2neo import *
graph = Graph("bolt://localhost:7687", user="neo4j", password="password")

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

def searchRestaurantbyMoney(money):
    moneyRestaurants = []
    if money == 1:
        query = """
        MATCH (restaurante)-[:Rango_Precios]-> (Money {name: "Q.50-Q.100"})
        RETURN restaurante.name
        """
    if money == 2:
        query = """
        MATCH (restaurante)-[:Rango_Precios]-> (Money {name: "Q.100-Q.105"})
        RETURN restaurante.name
        """
    if money == 3:
        query = """
        MATCH (restaurante)-[:Rango_Precios]-> (Money {name: "Q.150-Q.200"})
        RETURN restaurante.name
        """
    if money == 4:
        query = """
        MATCH (restaurante)-[:Rango_Precios]-> (Money {name: "Q.200-mas"})
        RETURN restaurante.name
        """
    restaurants = graph.run(query).data()
    for restaurant in restaurants:
        moneyRestaurants.append(restaurant)
        
    return moneyRestaurants

#----------------------------------------------
#Look for a restaurant depending the zone
def searchRestaurantbyScore(score):
    scoreRestaurants = []
    if score == 1:
        query = """
        MATCH (restaurante)-[:Calificado_con]-> (Score {name: "1 Estrella"})
        RETURN restaurante.name
        """
    if score == 2:
        query = """
        MATCH (restaurante)-[:Calificado_con]-> (Score {name: "2 Estrella"})
        RETURN restaurante.name
        """
    if score == 3:
        query = """
        MATCH (restaurante)-[:Calificado_con]-> (Score {name: "3 Estrella"})
        RETURN restaurante.name
        """
    if score == 4:
        query = """
        MATCH (restaurante)-[:Calificado_con]-> (Score {name: "4 Estrella"})
        RETURN restaurante.name
        """
    if score == 5:
        query = """
        MATCH (restaurante)-[:Calificado_con]-> (Score {name: "5 Estrella"})
        RETURN restaurante.name
        """

    restaurants = graph.run(query).data()
    for restaurant in restaurants:
        scoreRestaurants.append(restaurant)
        
    return scoreRestaurants



