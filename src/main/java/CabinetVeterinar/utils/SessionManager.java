package CabinetVeterinar.utils;


import CabinetVeterinar.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionManager extends AbstractSessionManager
{

    private static final SessionManager INSTANCE = new SessionManager();

    private SessionManager()
    {
    }

    public static void shutDown()
    {
        INSTANCE.shutdownSessionManager();
    }

    public static SessionFactory getSessionFactory()
    {
        return INSTANCE.getSessionFactory("CabinetVeterinar");
    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration)
    {

       configuration.addAnnotatedClass(Animal.class);
        configuration.addAnnotatedClass(Consultation.class);
        configuration.addAnnotatedClass(Doctor.class);
        configuration.addAnnotatedClass(Owner.class);
        configuration.addAnnotatedClass(Person.class);
        configuration.addAnnotatedClass(Treatment.class);


    }


}
