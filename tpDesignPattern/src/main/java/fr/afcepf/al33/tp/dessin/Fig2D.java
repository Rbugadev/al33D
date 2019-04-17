package fr.afcepf.al33.tp.dessin;

public abstract class Fig2D {
	protected String lineColor="black";
	
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	public abstract void performVisit(AbstractFigVisitor v);
	
   /*
    //Ancien code pas r�utilisable (car sp�cifique � awt/swing)
	public void dessinerAvecCouleur(Graphics g) {
		g.setColor(Color.decode(this.lineColor));
		this.dessiner(g);
	}
	
	public abstract void dessiner(Graphics g);
	*/
}
