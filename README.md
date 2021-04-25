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

https://www.baeldung.com/java-replace-if-statements

## IV - Implementação das soluções

Commit: https://github.com/guilhermemiua/arquitetura-software/commit/78d16d6051507d420041cd27640715fbaf4405ee

No commit acima, foi feita a implementação do Enum para substituir as estruturas condicionais encontradas no projeto. Nos Enums de Fontes de Potássio e Fósforo, foi realizado uma alteração para armazenar e retornar o valor da fonte. Com isto, foi eliminando o método das classes CorrecaoFosforo e CorrecaoPotassio que retornava o valor da fonte escolhida usando switch/case. Também foi criado métodos nos Enums para o retorno dos itens da Correção do Fósforo e Potássio, que são sobrescritos nos valores do Enum quando houver a necessidade. Dessa forma, eliminando os switch/case dos métodos de retorno do item de correção. Por fim, na classe CorrecaoPotassio havia um Switch/Case no método getParticipacaoCTCIdeal que foi removido com o armazenamento deste valor no Enum TexturaSolo junto a um método de retorno.

## V - Código após as alterações
```
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                            11            109             85            498
XML                              4              0              0            296
Maven                            1              0              0             22
-------------------------------------------------------------------------------
SUM:                            16            109             85            816
-------------------------------------------------------------------------------
```

Após a aplicação das alterações no código do projeto, houve um pequeno aumento na quantidade total de linhas de código. No entanto, todas as estruturas condicionais encontradas nas classes CorrecaoPotassio e CorrecaoFosforo foram removidas. 
