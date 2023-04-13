faturamento = {
    'SP': 67836.43,
    'RJ': 36678.66,
    'MG': 29229.88,
    'ES': 27165.48,
    'Outros': 19849.53
}
total = sum(faturamento.values())

while True:
    est = input("Digite a sigla do seu estado em maiúsculo: ")

    if est not in faturamento:
        print("Sigla inválida: Insira em MAIÚSCULA ou insira sigla VÁLIDA (SP, RJ, MG, ES, OUTROS)")
    else:
        percentual_est = (faturamento[est] / total) * 100
        print("O percentual de representação de", est, "é: {:.2f}%".format(percentual_est))
        break