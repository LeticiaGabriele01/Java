package org.example.Repositories;
import org.example.models.ContaBancaria;
import java.util.ArrayList;
import java.util.List;

public class ContaBancariaRepository {

    public ContaBancaria save (ContaBancaria Contabancaria){
        return new ContaBancaria();

    }
    public List<ContaBancaria> findAll(){
        return new ArrayList<>();

    }
}
