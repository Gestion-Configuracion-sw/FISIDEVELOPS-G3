CREATE TABLE TUSUARIO (
  IN_IDUSUARIO INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  VC_NOMBREUSUARIO VARCHAR(60) NOT NULL,
  VC_NOMBRES VARCHAR(60) NOT NULL,
  VC_DNI VARCHAR(10) NOT NULL,
  VC_CORREOE VARCHAR(40) NOT NULL,
  VC_TELEFONO VARCHAR(12) NOT NULL,
  VC_DOMICILIO VARCHAR(80) NULL,
  DT_FNACIMIENTO DATE NOT NULL,
  FL_SALDO FLOAT NOT NULL,
  CONTRASENA VARCHAR(11) NOT NULL,
  BO_ESTADO BOOL NOT NULL,
  PRIMARY KEY(IN_IDUSUARIO)
);

CREATE TABLE TCATEGORIA (
  IN_IDCATEGORIA INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  VC_NOMBRE VARCHAR(30) NOT NULL,
  VC_DESCRIPCION VARCHAR(120) NOT NULL,
  PRIMARY KEY(IN_IDCATEGORIA)
);

CREATE TABLE TARTICULO (
  IN_IDARTICULO INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  TCATEGORIA_IN_IDCATEGORIA INTEGER UNSIGNED NOT NULL,
  VC_NOMBRE VARCHAR(60) NOT NULL,
  VC_DESCRIPCION VARCHAR(60) NOT NULL,
  PRIMARY KEY(IN_IDARTICULO),
  INDEX TARTICULO_FKIndex2(TCATEGORIA_IN_IDCATEGORIA)
);

CREATE TABLE TIMAGEN (
  IN_IDIMAGEN INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  TARTICULO_IN_IDARTICULO INTEGER UNSIGNED NOT NULL,
  BL_IMAGEN BLOB NULL,
  VC_DETALLE VARCHAR(255) NULL,
  PRIMARY KEY(IN_IDIMAGEN),
  INDEX TIMAGEN_FKIndex1(TARTICULO_IN_IDARTICULO)
);

CREATE TABLE TSUBASTA (
  IN_IDSUBASTA INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  TARTICULO_IN_IDARTICULO INTEGER UNSIGNED NOT NULL,
  DT_INICIOSUBASTA DATE NOT NULL,
  DT_FINSUBASTA DATE NOT NULL,
  FL_PRECIOBASE FLOAT NOT NULL,
  VC_DESCRIPCION VARCHAR(1024) NOT NULL,
  VC_TELEFONOCONTACTO VARCHAR(12) NOT NULL,
  VC_LUGARENTREGA VARCHAR(255) NOT NULL,
  VC_ESTADO INTEGER UNSIGNED NULL,
  PRIMARY KEY(IN_IDSUBASTA),
  INDEX TSubasta_FKIndex1(TARTICULO_IN_IDARTICULO)
);

CREATE TABLE TPUJA (
  IN_IDPUJA INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  TSUBASTA_IN_IDSUBASTA INTEGER UNSIGNED NOT NULL,
  TUSUARIO_IN_IDUSUARIO INTEGER UNSIGNED NOT NULL,
  DT_FECHAPUJA DATE NOT NULL,
  FL_MONTOPUJA INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(IN_IDPUJA),
  INDEX TPuja_FKIndex1(TUSUARIO_IN_IDUSUARIO),
  INDEX TPuja_FKIndex2(TSUBASTA_IN_IDSUBASTA)
);

CREATE TABLE TREGISTROSUBASTA (
  IN_IDREGISTROSUBASTA INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  TUSUARIO_IN_IDUSUARIO INTEGER UNSIGNED NOT NULL,
  TSUBASTA_IN_IDSUBASTA INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(IN_IDREGISTROSUBASTA),
  INDEX TREGISTROSUBASTA_FKIndex1(TSUBASTA_IN_IDSUBASTA),
  INDEX TREGISTROSUBASTA_FKIndex2(TUSUARIO_IN_IDUSUARIO)
);


