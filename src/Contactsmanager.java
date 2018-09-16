import java.util.Scanner;
public class Contactsmanager {
    public static void main(String[] args){
        Contactsmanager mycontactmanager = new Contactsmanager();
    }

    public static void mycontactmanager() {
        Scanner mycontact = new Scanner(System.in);
        class Contact {
            String name;
            String email;
            String PhNumber;
        }

        class conatctmanager {
            Contact[] myfriends;
            int friendCount;
        }

        class Contactmanager{
            Contact[]  myfriends;
            int friendCount;

            void contactmanager(){
                this.friendCount = 0;
                this.myfriends = new Contact[500];

            }

            void addcontact(Contact Contact) {
                myfriends[friendCount] = Contact;
                friendCount++;
            }

            Contact SearchContact(String searchName) {
                for (int i = 0; i < friendCount; i++) {
                    if (myfriends[i].name.equals(searchName)) {
                        return myfriends[i];
                    }
                }
                return null;

            }
        }
    }


}
