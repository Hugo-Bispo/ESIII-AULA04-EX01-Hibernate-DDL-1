package util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import model.Consulta;
import model.Endereco_Medico;
import model.Endereco_Paciente;
import model.Especialidade;
import model.Medico;
import model.Medico_Especialidade;
import model.Observacao;
import model.Paciente;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();

				// Hibernate settings equivalent to hibernate.cfg.xml's properties
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/ESIII-AULA04-EX01-Hibernate-DDL-1?createDatabaseIfNotExist=true");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "12345678");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				settings.put(Environment.HBM2DDL_AUTO, "update");

				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Endereco_Paciente.class);
				configuration.addAnnotatedClass(Paciente.class);
				configuration.addAnnotatedClass(Medico.class);
				configuration.addAnnotatedClass(Endereco_Medico.class);
				configuration.addAnnotatedClass(Medico_Especialidade.class);
				configuration.addAnnotatedClass(Especialidade.class);
				configuration.addAnnotatedClass(Observacao.class);
				configuration.addAnnotatedClass(Consulta.class);
				
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties())
						.build();

				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}