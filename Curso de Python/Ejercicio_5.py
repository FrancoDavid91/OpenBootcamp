def esBiciesto (year):
    if (year % 4) == 0:
        print("El año",year,"es biciesto.")
    elif (year % 4) != 0:
        print("El año",year,"no es biciesto.")

esBiciesto(2000)
esBiciesto(2002)
esBiciesto(2008)
esBiciesto(2017)
