package starter.petstore;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenFetchingAlreadyAvailablePet {

    Long newPetId = null;
    PetApiActions petApiActions;

    @Test
    public void fetchAlreadyAvailablePet() {
        newPetId = petApiActions.givenKittyIsAvailableInPetStore();
        petApiActions.whenIAskForAPetWithId(newPetId);
        petApiActions.thenISeeKittyAsResult();
    }
}
