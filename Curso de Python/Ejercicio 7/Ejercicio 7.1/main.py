import time

def timeit():
    current_time = time.strftime("%H:%M", time.gmtime())
    current_hour = int(current_time.split(':')[0])
    current_minutes = int(current_time.split(':')[1])


    if current_hour >= 19:
        print("Hora de ir a casa!")
    else:

        hours_remaining = 19 - current_hour
        minutes_remaining = 60 - current_minutes
        if minutes_remaining == 60:
            hours_remaining -= 1
            minutes_remaining = 0
            print("Faltan {} horas y {} minutos para ir a casa.".format(hours_remaining, minutes_remaining))


