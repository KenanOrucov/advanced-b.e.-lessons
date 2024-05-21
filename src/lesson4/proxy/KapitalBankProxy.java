package lesson4.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KapitalBankProxy implements Application{

    private KapitalBank app;
    private List<KapitalBank> cache = new ArrayList<>();

    @Override
    public String openApp() {
        if (app == null){
            app = new KapitalBank();
            cache.add(app);
            System.out.println("KapitalBank created");
        }
        return app.openApp();
    }
}
