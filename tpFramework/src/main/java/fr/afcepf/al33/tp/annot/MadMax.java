package fr.afcepf.al33.tp.annot;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)  //annotation conserv�e au runtime dans le code compil�
public @interface MadMax {
	int value();
	String comment();
}
