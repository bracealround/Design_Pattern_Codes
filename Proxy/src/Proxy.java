/*
IN case of using firebase we use it in such a way that it is located inside of our ram(jvm heap).
but it is actually located in google cloud.
 */
/*
Firebase Database = new Firebase()
database.update()

Firebase database
Client ram          Server ram
Client code         Request handler
FirebaseProxy       Firebase

Firebase proxy sends a request to request handler of the server ram.
here i am using a proxy of the firebase.

 */
/*
proxy is a fancy term of adapter patterns api.
like cache server.
 */
/*
proxypattern is useful for theroy but not for lab.concept is important for theory.
 */
public class Proxy {
    public static void main(String[] args) {
        System.out.println();
    }
}
