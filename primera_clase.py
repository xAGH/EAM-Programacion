cadena: str = "Hola mundo" # Cadenas de texto
numerico_entero: int = 2_000_000_000 # Número enteros, los _ se pueden utilizar
                                     # para identificar los puntos de mil, no afecta
                                     # a la ejecución
numerico_decimal: float = 2.2 # Permite números enteros con parte decimal
booleano: bool = True # Valores de positivo(True) o negativo(False)
nullo: None = None # Nada, literal, nada
listas: list = [cadena, numerico_decimal, numerico_entero, booleano, nullo] # Almacena diferentes
# Tipos de datos, se puede modificar su contenido.
tuplas: tuple = (cadena, numerico_decimal, numerico_entero, booleano, nullo)# Almacena diferentes
# Tipos de datos, se puede modificar su contenido.
diccionarios: dict = {"saludo":cadena, "numero":numerico_decimal} # Permite almacenar valores bajo una llave
sets: set = {cadena, numerico_decimal, numerico_entero} # Conjuntos de datos

# operadores -> == != > < <= >= and or not

numero = 1

if numero > 3:
    print("El número es mayor")
    print("Sigue en el if")
elif numero == 3:
    print("Los números son iguales")
else:
    pass

# print("Se terminó la condición")

def funcion1():
    print("Este es el función 1")

def funcion2() -> str:
    return "Esta es el función 2"

def funcion3(parametro: str):
    pass

print(funcion1())
print(funcion2())

# mundo: str = "Mundo"
# desde: str = "Python"
# print("Hola " + "Mundo")
# print("Hola ", "Mundo")
# print("Hola {} desde {}".format(mundo, desde))
# print(f"Hola {mundo} desde {desde}")