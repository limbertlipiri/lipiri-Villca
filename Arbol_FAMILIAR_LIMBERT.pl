% This buffer is for notes you don't want to save.
% If you want to create a file, visit that file with C-x C-f,
% then enter the text in that file's own buffer.

padre_de(gavino,nicolas).
padre_de(gavino,javier).
padre_de(gavino,alicia).
padre_de(gavino,crispin).
padre_de(gavino,santusa).
padre_de(gavino,ulimpia).

padre_de(nicolas,limbert).
padre_de(nicolas,wilmer).
padre_de(nicolas,edilma).

hijo_de(Y,X):-padre_de(X,Y).
abuelo_de(Y,Z):-padre_de(Y,X),padre_de(X,Z).
nieto_de(Z,Y):-abuelo_de(Y,Z).

hermano_de(Z,Y):-padre_de(X,Y),padre_de(X,Z).
