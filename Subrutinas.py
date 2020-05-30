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

#Look for a restaurant depending the money accesibility
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
#Look for a restaurant depending the score
def searchRestaurantbyScore(score):
    scoreRestaurants = []
    if score == 1:
        query = """
        MATCH (restaurante)-[:Calificado_con]-> (Score {name: "1 Estrella"})
        RETURN restaurante.name
        """
    if score == 2:
        query = """
        MATCH (restaurante)-[:Calificado_con]-> (Score {name: "2 Estrellas"})
        RETURN restaurante.name
        """
    if score == 3:
        query = """
        MATCH (restaurante)-[:Calificado_con]-> (Score {name: "3 Estrellas"})
        RETURN restaurante.name
        """
    if score == 4:
        query = """
        MATCH (restaurante)-[:Calificado_con]-> (Score {name: "4 Estrellas"})
        RETURN restaurante.name
        """
    if score == 5:
        query = """
        MATCH (restaurante)-[:Calificado_con]-> (Score {name: "5 Estrellas"})
        RETURN restaurante.name
        """
    restaurants = graph.run(query).data()
    for restaurant in restaurants:
        scoreRestaurants.append(restaurant)
    return scoreRestaurants

#Look for a restaurant depending the food type
def searchRestaurantbyType(foodType):
    typeRestaurants = []
    if foodType == 1:
        query = """
        MATCH (restaurante)-[:Tipo]-> (Type {name: "Gourmet"})
        RETURN restaurante.name
        """
    if foodType == 2:
        query = """
        MATCH (restaurante)-[:Tipo]-> (Type {name: "Pizza"})
        RETURN restaurante.name
        """
    if foodType == 3:
        query = """
        MATCH (restaurante)-[:Tipo]-> (Type {name: "Tacos"})
        RETURN restaurante.name
        """
    if foodType == 4:
        query = """
        MATCH (restaurante)-[:Tipo]-> (Type {name: "Shucos"})
        RETURN restaurante.name
        """
    if foodType == 5:
        query = """
        MATCH (restaurante)-[:Tipo]-> (Type {name: "Casera"})
        RETURN restaurante.name
        """
    if foodType == 6:
        query = """
        MATCH (restaurante)-[:Tipo]-> (Type {name: "Pollo"})
        RETURN restaurante
        """
    if foodType == 7:
        query = """
        MATCH (restaurante)-[:Tipo]-> (Type {name: "Comida Rapida"})
        RETURN restaurante
        """
    if foodType == 8:
        query = """
        MATCH (restaurante)-[:Tipo]-> (Type {name: "Carne"})
        RETURN restaurante
        """
    if foodType == 4:
        query = """
        MATCH (restaurante)-[:Rango_Precios]-> (Type {name: "Hamburguesa"})
        RETURN restaurante
        """
    restaurants = graph.run(query).data()
    for restaurant in restaurants:
        typeRestaurants.append(restaurant)
        
    return typeRestaurants
#add a new relationship
def newRelationship(tipo, restaurant, relationShip,nombre):
    if relationShip == 1:
        if tipo == 1:            
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Zona9:Zone {name: "Zona 9"})
                CREATE (%s)-[:Ubicado_En]->(Zona9)
            """ %(nombre,restaurant,nombre)
        if tipo == 2:            
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Zona10:Zone {name: "Zona 10"})
                CREATE (%s)-[:Ubicado_En]->(Zona10)
            """ %(nombre,restaurant,nombre)
        if tipo == 3:            
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Zona15:Zone {name: "Zona 15"})
                CREATE (%s)-[:Ubicado_En]->(Zona15)
                """ %(nombre,restaurant,nombre)
        
    if relationShip == 2:
        if tipo == 1:            
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Rango1:Money {name: "Q.50-Q.100"})
                CREATE (%s)-[:Rango_Precios]->(Rango1)
                """ %(nombre,restaurant,nombre)
        if tipo == 2:            
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Rango2:Money {name: "Q.100-Q.150"})
                CREATE (%s)-[:Rango_Precios]->(Rango2)
                """ %(nombre,restaurant,nombre)
        if tipo == 3:            
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Rango3:Money {name: "Q.150-Q.200"})
                CREATE (%s)-[:Rango_Precios]->(Rango3)
                """ %(nombre,restaurant,nombre)
        if tipo == 4:            
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Rango3:Money {name: "Q.200-mas"})
                CREATE (%s)-[:Rango_Precios]-> (Rango4)
                """ %(nombre,restaurant,nombre)
        
    if relationShip == 3:
        if tipo == 1:            
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Uno:Score {name: "1 Estrella"})
                CREATE (%s)-[:Calificado_con]->(Uno)
                """%(nombre,restaurant,nombre)
        if tipo == 2:            
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Dos:Score {name: "2 Estrellas"})
                CREATE (%s)-[:Calificado_con]->(Dos)
                """ %(nombre,restaurant,nombre)
        if tipo == 3:            
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Tres:Score {name: "3 Estrellas"})
                CREATE (%s)-[:Calificado_con]->(Tres)
                """ %(nombre,restaurant,nombre)
        if tipo == 4:            
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Cuatro:Score {name: "4 Estrellas"})
                CREATE (%s)-[:Calificado_con]->(Cuatro)
                """ %(nombre,restaurant,nombre)
        if tipo == 5:            
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Cinco:Score {name: "5 Estrellas"})
                CREATE (%s)-[:Calificado_con]->(Cinco)
                """ %(nombre,restaurant,nombre)
    if relationShip == 4:
        if tipo == 1:
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Tipo1:Type {name: "Gourmet"})
                CREATE (%s)-[:Tipo]->(Tipo1)
                """ %(nombre,restaurant,nombre)
        if tipo == 2:
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Tipo2:Type {name: "Pizza"})
                CREATE (%s)-[:Tipo]->(Tipo2)
                """ %(nombre,restaurant,nombre)
        if tipo == 3:
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Tipo3:Type {name: "Tacos"})
                CREATE (%s)-[:Tipo]->(Tipo3)
                """ %(nombre,restaurant,nombre)
        if tipo == 4:
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Tipo4:Type {name: "Tacos"})
                CREATE (%s)-[:Tipo]->(Tipo4)
                """ %(nombre,restaurant,nombre)
        if tipo == 5:
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Tipo5:Type {name: "Shucos"})
                CREATE (%s)-[:Tipo]->(Tipo5)
                """ %(nombre,restaurant,nombre)
        if tipo == 6:
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Tipo6:Type {name: "Casera"})
                CREATE (%s)-[:Tipo]->(Tipo6)
                """ %(nombre,restaurant,nombre)
        if tipo == 7:
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Tipo7:Type {name: "Pollo"})
                CREATE (%s)-[:Tipo]->(Tipo7)
                """ %(nombre,restaurant,nombre)
        if tipo == 8:
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Tipo8:Type {name: "Comida Rapida"})
                CREATE (%s)-[:Tipo]->(Tipo8)
                """ %(nombre,restaurant,nombre)
        if tipo == 9:
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Tipo9:Type {name: "Carne"})
                CREATE (%s)-[:Tipo]->(Tipo9)
                """ %(nombre,restaurant,nombre)
        if tipo == 10:
            query = """
                MATCH (%s:Restaurant {name:"%s"}),(Tipo10:Type {name: "Hamburguesa"})
                CREATE (%s)-[:Tipo]->(Tipo10)
                """ %(nombre,restaurant,nombre)
    data = graph.run(query)
    for p in data:
        print (p)
    

def determinateRecommendation(zoneRestaurants,moneyRestaurants,scoreRestaurants,typeRestaurants):
    recommendation = []
    for restaurant in zoneRestaurants:
        if restaurant in moneyRestaurants:
            recommendation.append(restaurant)
    for restaurant in zoneRestaurants:
        if restaurant in scoreRestaurants:
            recommendation.append(restaurant)
    for restaurant in zoneRestaurants:
        if restaurant in moneyRestaurants:
            recommendation.append(restaurant)

    return recommendation

#Look for the restaurants that complete the user requirements
def finalRecommendation(recommendation):
    unique = []
    finalrecommendation = []
    for x in recommendation:
        if x not in unique:
            unique.append(x)
        else:
            if x not in finalrecommendation:
                finalrecommendation.append(x)
            
    return finalrecommendation
    



