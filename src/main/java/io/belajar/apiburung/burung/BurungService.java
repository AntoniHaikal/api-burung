package io.belajar.apiburung.burung;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BurungService {
    private List<BurungInterface> burungs = new ArrayList<>(Arrays.asList(
            new BurungInterface("Perkutut", "Perkutut1", "Ini adalah burung perkutut"),
            new BurungInterface("Balam", "Balam1", "Ini adalah burung balam")
    ));

    public List<BurungInterface> getBurungs() {
        return burungs;
    }

    public BurungInterface getBurung(String id) {
        return burungs.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addBurung(BurungInterface burung) {
        burungs.add(burung);
    }

    public void updateBurung(String id, BurungInterface burung) {
        for (int i = 0; i < burungs.size(); i++) {
            BurungInterface t = burungs.get(i);
            if (t.getId().equals(id)) {
                burungs.set(i, burung);
                return;
            }
        }
    }

    public void deleteBurung(String id) {
        burungs.removeIf(t -> t.getId().equals(id));
    }

}
