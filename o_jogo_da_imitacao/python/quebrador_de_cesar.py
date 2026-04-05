def decifrar_cesar(texto, deslocamento):
    resultado = ""
    for caractere in texto.lower():
        if caractere.isalpha():
            posicao = ord(caractere) - ord('a')
            nova_posicao = (posicao - deslocamento) % 26
            resultado += chr(nova_posicao + ord('a'))
        else:
            resultado += caractere
    return resultado

print("--- Sistema de Interceptacao Python (Brute Force) ---")
mensagem_cifrada = input("Digite a mensagem cifrada: ")
print("\nIniciando tentativa de quebra...\n")

for shift in range(1, 26):
    tentativa = decifrar_cesar(mensagem_cifrada, shift)
    print(f"Tentativa (Shift {shift:02d}): {tentativa}")

print("\nAnalise as opcoes acima para encontrar a mensagem original!")
