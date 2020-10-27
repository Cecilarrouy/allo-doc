package sopra.monRdv.monrdv.model;

public class Views {

	public static class ViewCommon {}
	
	public static class ViewCreneauHoraire extends ViewCommon {}
	
	public static class ViewLieuDeConsultation extends ViewCommon {}
	
	public static class ViewMotifsConsultations extends ViewCommon {}
	
	public static class ViewPersonne extends ViewCommon {}
	public static class ViewPatient extends ViewPersonne {}
	public static class ViewPraticien extends ViewPersonne {}
	
	public static class ViewRendezVous extends ViewCommon {}
	
	public static class ViewRendezVousDetail extends ViewRendezVous {}
	
	
	
	
	public static class ViewUtilisateur extends ViewCommon {}
	
}
