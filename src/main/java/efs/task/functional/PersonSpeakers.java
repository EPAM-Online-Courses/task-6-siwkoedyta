package efs.task.functional;

class PersonSpeakers {

    private final String HELLO = "Hello. I'm ";
    private final String CZESC = "Czesc. Jestem ";
    private final String HALLO = "Hallo, ich heiBe ";


    Speaker createGreetSpeaker() {
        // Implementacja interfejsu Speaker za pomocą wyrażenia lambda. Implementacja w tej postaci możliwa jest
        // dzięki temu, że Speaker jest interfejsem funkcyjnym - posiada tylko jedną metodę abstrakcyjną.
        return p -> HELLO + p.getName();
    }

    Speaker createShoutingSpeaker() {
        return p -> HELLO.toUpperCase() + p.getName().toUpperCase();
    }

    Speaker createGreetLocalSpeaker() {
        return p -> {
            switch (p.getCountryOfLiving()) {
                case USA:
                    return HELLO + p.getName();
                case PL:
                    return CZESC + p.getName();
                case DE:
                    return HALLO + p.getName();
                default:
                    return HELLO + p.getName();
            }
        };
    }
}
