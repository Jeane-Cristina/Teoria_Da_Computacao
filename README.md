# Atividade Acadêmica — Máquina Enigma

## Objetivo

Esta atividade integra **História**, **Matemática** e **Ciência da Computação** através do estudo da máquina Enigma e dos métodos utilizados para decifrar suas mensagens durante a Segunda Guerra Mundial.

---

# 1. Desafio de Criptoanálise

## Espaço de chaves da Enigma

Considerando:

* 5 rotores disponíveis
* 3 rotores utilizados por vez
* 26 posições iniciais por rotor
* plugboard com até 10 conexões

### 1. Ordem dos rotores

Permutação de 5 rotores escolhendo 3:

P(5,3) = 5 × 4 × 3 = **60 combinações**

### 2. Posição inicial

Cada rotor possui 26 posições:

26³ = **17.576 combinações**

### 3. Plugboard

Número aproximado de combinações possíveis:

**150.738.274.937.250**

### 4. Espaço total de chaves

Total aproximado:

```
60 × 17576 × 150738274937250
≈ 1.58 × 10^23 combinações
```

Ou seja, cerca de **158 sextilhões de configurações possíveis**.

---

# 2. Programa em Python (cálculo do espaço de chaves)

```python
import math

rotor_orders = math.perm(5, 3)
rotor_positions = 26 ** 3

plugboard = 150738274937250

total = rotor_orders * rotor_positions * plugboard

print("Ordens de rotores:", rotor_orders)
print("Posições iniciais:", rotor_positions)
print("Combinações plugboard:", plugboard)
print("Total de combinações possíveis:", total)
```

---

# 3. Programa em Java

```java
public class EnigmaCombinacoes {

    public static void main(String[] args) {

        int rotorOrders = 5 * 4 * 3;
        int rotorPositions = (int) Math.pow(26, 3);

        long plugboard = 150738274937250L;

        double total = rotorOrders * rotorPositions * plugboard;

        System.out.println("Ordens de rotores: " + rotorOrders);
        System.out.println("Posições iniciais: " + rotorPositions);
        System.out.println("Combinações plugboard: " + plugboard);
        System.out.println("Total de combinações possíveis: " + total);
    }
}
```

---

# 4. Simulador simplificado da Enigma (Python)

```python
import string

alphabet = string.ascii_uppercase

rotor1 = "EKMFLGDQVZNTOWYHXUSPAIBRCJ"
rotor2 = "AJDKSIRUXBLHWTMCQGZNPYFVOE"
rotor3 = "BDFHJLCPRTXVZNYEIWGAKMUSQO"

def encrypt(letter, r1, r2, r3):
    i = alphabet.index(letter)
    l1 = r1[i]
    l2 = r2[alphabet.index(l1)]
    l3 = r3[alphabet.index(l2)]
    return l3

message = "HELLO"

result = ""

for l in message:
    result += encrypt(l, rotor1, rotor2, rotor3)

print(result)
```

---

# 5. Operação Bletchley Park

## Configuração da máquina

* Modelo: Enigma I
* Rotores: I – II – III
* Posição inicial: A – B – C
* Ring setting: A – A – A
* Plugboard: A-M, B-N, C-O

## Mensagem interceptada

```
PXQZ GBDN
```

## Resultado

Mensagem decifrada:

```
HELLO YOU
```

---

# 6. Propriedade de Reciprocidade

A máquina Enigma possui a propriedade:

```
E(E(x)) = x
```

Ou seja:

* A mesma configuração usada para **criptografar** também serve para **descriptografar**.

Isso ocorre devido ao **refletor** presente na máquina.

---

# 7. Teste de erro de configuração

Se alterarmos apenas a posição inicial:

```
A B C
```

para

```
B B C
```

A mensagem deixa de fazer sentido.

Isso demonstra um princípio importante da criptografia:

**pequenas mudanças na chave produzem resultados completamente diferentes.**

---

# 8. Perguntas do relatório

## P1 — Inverter ordem dos rotores

Se alterarmos:

```
I II III
```

para

```
II I III
```

A mensagem não poderá ser decifrada corretamente, pois o caminho elétrico da cifra muda completamente.

---

## P2 — Importância do Plugboard

O plugboard adiciona uma camada extra de substituição de letras antes e depois dos rotores.

Mesmo com poucas conexões, ele adiciona **trilhões de combinações possíveis**, aumentando drasticamente a segurança.

---

## P3 — Roubo da máquina

Mesmo que um espião tivesse acesso físico à máquina Enigma, ele não conseguiria ler as mensagens sem o **livro de códigos** contendo:

* ordem dos rotores
* posição inicial
* configuração do plugboard

Esse conceito demonstra um princípio fundamental da criptografia moderna:

> A segurança deve estar na **chave**, não no algoritmo.


