package ma.xproce.dsavion;

import ma.xproce.dsavion.dao.entities.Avion;

import ma.xproce.dsavion.dao.repositories.AvionRepository;
import ma.xproce.dsavion.dto.AvionDto;
import ma.xproce.dsavion.service.AvionService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DsavionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsavionApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AvionRepository avionRepository){
        return  args -> {

            List<Avion> avions = List.of(
                           Avion.builder().model("model1").color("red").matricul("sdf64w6e").price(12345).build(),
                           Avion.builder().model("model2").color("green").matricul("ef6e+6").price(65489).build(),
                           Avion.builder().model("model3").color("yellow").matricul("ef64we8").price(89789).build(),
                            Avion.builder().model("model4").color("black").matricul("wrdqwqw").price(67489).build()
                    );

            avionRepository.saveAll(avions);
        };



//            avionService.saveAvions( //List<Avion> avions =
//                     List.of(
//                            AvionDto.builder().model("model1").color("red").matricul("sdf64w6e").price(12345).build(),
//                            AvionDto.builder().model("model2").color("green").matricul("ef6e+6").price(65489).build(),
//                            AvionDto.builder().model("model3").color("yellow").matricul("ef64we8").price(89789).build(),
//                            AvionDto.builder().model("model4").color("black").matricul("wrdqwqw").price(67489).build()
//                     )
//            );
        };
    }

