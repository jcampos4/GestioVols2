package testEntity;

import java.time.LocalDateTime;
import java.util.Date;

import components.Avio;
import components.Classe;
import components.RutaIntercontinental;
import components.RutaInternacional;
import components.RutaNacional;
import components.RutaTransoceanica;
import components.TCP;
import components.Tripulant;
import components.TripulantCabina;
import principal.Companyia;
import principal.Component;
import principal.Vol;

public class TestEntity {
	// Test Objects
	private Avio avio;
	private Classe classe;
	private RutaNacional rutaNacional;
	private RutaInternacional rutaInternacional;
	private RutaIntercontinental rutaIntercontinental;
	private RutaTransoceanica rutaTransoceanica;
	private TCP tcp;
	private TripulantCabina tripulantCabina;
	private Vol vol;
	private Companyia companyia;

	// Construct class and test objects
	public TestEntity() {
		createAvio();
		createRutes();
		createTripulants();
		createVol();
		createCompanyia();
	}

	private void createAvio() {
		avio = new Avio("CODITEST", "FabricantTest", "ModelTest", 100);
		classe = new Classe("TestClasse", 100);
		avio.setClasses(new Classe[] { classe });
		avio.setPosicioClasses(1);
	}

	private void createRutes() {
		rutaNacional = new RutaNacional("CODITEST", "País", "AeroportOrigenTest", "AeroportDestíTest", 1000);
		rutaInternacional = new RutaInternacional("CODITEST", "AeroportOrigenTest", "AeroportDestíTest", "PaísOrigen",
				"PaísDestí", 1000);
		rutaIntercontinental = new RutaIntercontinental("CODITEST", "AeroportOrigenTest", "AeroportDestíTest",
				"PaísOrigen", "PaísDestí", "ContinentOrigen", "ContinentDestí", 1000);
		rutaTransoceanica = new RutaTransoceanica("CODITEST", "AeroportOrigenTest", "AeroportDestíTest", "PaísOrigen",
				"PaísDestí", "ContinentOrigen", "ContinentDestí", "OceàTest", 1000);
	}

	private void createTripulants() {
		tcp = new TCP("PassaportTest", "NomTest", 40, 100);
		tripulantCabina = new TripulantCabina("PassaportTest", "NomTest", 40, 100, "C");

	}

	private void createVol() {
		vol = new Vol("CODITEST", new Date(), new Date(), LocalDateTime.now().toLocalTime(),
				LocalDateTime.now().toLocalTime());
		vol.setTripulacio(new Tripulant[] { tcp, tripulantCabina });
	}

	private void createCompanyia() {
		companyia = new Companyia("CompanyiaTest");
		Component[] components = { avio, rutaNacional, rutaInternacional, rutaIntercontinental, rutaTransoceanica, tcp,
				tripulantCabina };
		companyia.setComponents(components);
	}

	// Getters & Setters
	public Avio getAvio() {
		return avio;
	}

	public void setAvio(Avio avio) {
		this.avio = avio;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public RutaNacional getRutaNacional() {
		return rutaNacional;
	}

	public void setRutaNacional(RutaNacional rutaNacional) {
		this.rutaNacional = rutaNacional;
	}

	public RutaInternacional getRutaInternacional() {
		return rutaInternacional;
	}

	public void setRutaInternacional(RutaInternacional rutaInternacional) {
		this.rutaInternacional = rutaInternacional;
	}

	public RutaIntercontinental getRutaIntercontinental() {
		return rutaIntercontinental;
	}

	public void setRutaIntercontinental(RutaIntercontinental rutaIntercontinental) {
		this.rutaIntercontinental = rutaIntercontinental;
	}

	public RutaTransoceanica getRutaTransoceanica() {
		return rutaTransoceanica;
	}

	public void setRutaTransoceanica(RutaTransoceanica rutaTransoceanica) {
		this.rutaTransoceanica = rutaTransoceanica;
	}

	public TCP getTcp() {
		return tcp;
	}

	public void setTcp(TCP tcp) {
		this.tcp = tcp;
	}

	public TripulantCabina getTripulantCabina() {
		return tripulantCabina;
	}

	public void setTripulantCabina(TripulantCabina tripulantCabina) {
		this.tripulantCabina = tripulantCabina;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Companyia getCompanyia() {
		return companyia;
	}

	public void setCompanyia(Companyia companyia) {
		this.companyia = companyia;
	}
}
