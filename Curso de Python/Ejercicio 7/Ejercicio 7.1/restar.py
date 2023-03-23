def restar(*args):
    resultado = args[0]
    for i in range(1, len(args)):
        resultado -= args[i]
    return resultado
