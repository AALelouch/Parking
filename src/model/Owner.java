package model;

public class Owner {

    private String name;
    private String surname;
    private String identification;
    private String cellphone;

    public Owner(String name, String surname, String identification, String cellphone){

        validatorOfAlphabeticalValues(name);
        validatorOfAlphabeticalValues(surname);
        validatorOfNumericValues(identification);
        validatorOfNumericValues(cellphone);

        this.name = name;
        this.surname = surname;
        this.identification = identification;
        this.cellphone = cellphone;
    }

    //Validators
    public void validatorOfAlphabeticalValues(String str){
        for (int i = 0; i<= str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                throw new IllegalArgumentException("Invalid data");
            }
        }
    }

    public void validatorOfNumericValues(String str){
        for (int i = 0; i<= str.length(); i++){
            if (!Character.isDigit(str.charAt(i))){
                throw new IllegalArgumentException("Invalid data");
            }
        }
    }
}
