/*
unoptimized:
Subject
    interesting product.
    addobserver(ob)
    removeobserver(ob)
    notifyobserver()

    getcricketdata()//api
    getfootballdata()//api


Observer(interested party)
    update(Subject sub)//what are they interested in
    observer will call the api.

 */

/*
Book example:
applications will call info from wether service through an api.
 */
/*
Pooling:Check frequently.
Megazine subscription is better than multiple checking.
 */

public class Main {
    public static void main(String[] args) {
        WeatherService weatherService =new WeatherService();
        GoogleMap googleMap = new GoogleMap();
        Accuweathe accuweathe = new Accuweathe();

        weatherService.addObserver(googleMap);
        weatherService.addObserver(accuweathe);
        weatherService.notifyObserver();

        weatherService.removeObserver(accuweathe);
        weatherService.notifyObserver();

    }
}
