import matplotlib.pyplot


# meses = ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho']
# valores = [105235, 107697, 110256, 109236, 108859, 109986]

# matplotlib.pyplot.plot(meses, valores)

# print(matplotlib.pyplot.show())


# Analise transitória 

import numpy as np
import math
A = 200
tal = 0.0015
exp = math.e
x = []
y = []

tempo = np.arange(0.0, 2.0, 0.0001)
for t in tempo:
    x.append(t)
    y.append(A * (1 - ((exp) ** (-t / tal))))

matplotlib.pyplot.plot(x, y)
print(matplotlib.pyplot.show())
