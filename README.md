# Arquitetura de Software
Projeto para disciplina de Arquitetura do Software do curso de Engenharia de Software da UTFPR - Câmpus Cornélio Procópio

# Relatório
## I - Código antes das mudanças
```
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                            11            100             85            468
XML                              4              0              0            296
Maven                            1              0              0             22
-------------------------------------------------------------------------------
SUM:                            16            100             85            786
-------------------------------------------------------------------------------
```

## II - Problemas identificados
Foi identificado a existência de 13 estruturas condicionais. Sendo 3 estruturas no arquivo "CorrecaoFosforo.java", 5 no "CorrecaoPotassio.java" e 5 no "Solo.java".


## III - Soluções encontradas

Aplicado o padrão de projeto Strategy para melhorar a manutenabilidade dos métodos de valores ideais da análise do solo.
Commit: [https://github.com/guilhermemiua/arquitetura-software/commit/98ab27b87f8233c3d8512f42f44f3136001e78db]
