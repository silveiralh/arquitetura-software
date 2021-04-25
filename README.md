# Arquitetura de Software
Projeto para disciplina de Arquitetura do Software do curso de Engenharia de Software da UTFPR - Câmpus Cornélio Procópio

# Relatório
## I - Código antes das mudanças
```
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                            11            103             85            485
XML                              4              0              0            296
Maven                            1              0              0             22
-------------------------------------------------------------------------------
SUM:                            16            103             85            803
-------------------------------------------------------------------------------
```

## II - Problemas identificados
Foi identificado a existência de 8 estruturas condicionais. Sendo 3 estruturas no arquivo "CorrecaoFosforo.java" e 5 no "CorrecaoPotassio.java".

## III - Soluções encontradas
No link abaixo, é possível visualizar alternativas para substituir as estruturas condicionais em um projeto Java. A alternativa escolhida para aplicação no projeto foi o uso de Enums com métodos sendo sobrescritos.

[https://www.baeldung.com/java-replace-if-statements]

