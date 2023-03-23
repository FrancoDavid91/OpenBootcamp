class Alumno:
    nombre = None
    nota = None
    def __init__(self, nombre, nota):
        
            self.nombre = nombre
            print("El nombre del alumno es", nombre)
        
            self.nota = nota
            if (nota >= 6):
                print("Nota del alumno:", nota, " --> Aprobado")
            else:
                print("Nota del alumno:", nota, " --> Desaprobado")
        
alumno = Alumno("Juan", 6)
