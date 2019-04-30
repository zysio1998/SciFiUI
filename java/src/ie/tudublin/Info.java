package ie.tudublin;

import processing.data.TableRow;

public class Info
{
    private String PlanetName;
    private String PlanetSize;
    private String PlanetMass;
    private String PlanetPopulation;
    private String AmountOfMoons;
    private String TimeOfOrbitAroundSun;
    private String DistanceFromSun;
    private String PlanetTemp;
    private String Gravity;
    private String LengthOfDay;

    /**
     * @return the planetName
     */
    public String getPlanetName() {
        return PlanetName;
    }

    /**
     * @param planetName the planetName to set
     */
    public void setPlanetName(String planetName) {
        PlanetName = planetName;
    }

    /**
     * @return the planetSize
     */
    public String getPlanetSize() {
        return PlanetSize;
    }

    /**
     * @param planetSize the planetSize to set
     */
    public void setPlanetSize(String planetSize) {
        PlanetSize = planetSize;
    }

    /**
     * @return the planetMass
     */
    public String getPlanetMass() {
        return PlanetMass;
    }

    /**
     * @param planetMass the planetMass to set
     */
    public void setPlanetMass(String planetMass) {
        PlanetMass = planetMass;
    }

    /**
     * @return the planetPopulation
     */
    public String getPlanetPopulation() {
        return PlanetPopulation;
    }

    /**
     * @param planetPopulation the planetPopulation to set
     */
    public void setPlanetPopulation(String planetPopulation) {
        PlanetPopulation = planetPopulation;
    }

    /**
     * @return the amountOfMoons
     */
    public String getAmountOfMoons() {
        return AmountOfMoons;
    }

    /**
     * @param amountOfMoons the amountOfMoons to set
     */
    public void setAmountOfMoons(String amountOfMoons) {
        AmountOfMoons = amountOfMoons;
    }

    /**
     * @return the timeOfOrbitAroundSun
     */
    public String getTimeOfOrbitAroundSun() {
        return TimeOfOrbitAroundSun;
    }

    /**
     * @param timeOfOrbitAroundSun the timeOfOrbitAroundSun to set
     */
    public void setTimeOfOrbitAroundSun(String timeOfOrbitAroundSun) {
        TimeOfOrbitAroundSun = timeOfOrbitAroundSun;
    }

    /**
     * @return the distanceFromSun
     */
    public String getDistanceFromSun() {
        return DistanceFromSun;
    }

    /**
     * @param distanceFromSun the distanceFromSun to set
     */
    public void setDistanceFromSun(String distanceFromSun) {
        DistanceFromSun = distanceFromSun;
    }

    /**
     * @return the planetTemp
     */
    public String getPlanetTemp() {
        return PlanetTemp;
    }

    /**
     * @param planetTemp the planetTemp to set
     */
    public void setPlanetTemp(String planetTemp) {
        PlanetTemp = planetTemp;
    }

    /**
     * @return the gravity
     */
    public String getGravity() {
        return Gravity;
    }

    /**
     * @param gravity the gravity to set
     */
    public void setGravity(String gravity) {
        Gravity = gravity;
    }

    /**
     * @return the lengthOfDay
     */
    public String getLengthOfDay() {
        return LengthOfDay;
    }

    /**
     * @param lengthOfDay the lengthOfDay to set
     */
    public void setLengthOfDay(String lengthOfDay) {
        LengthOfDay = lengthOfDay;
    }

    public String toString()
    {
        return PlanetName + "\t" + PlanetSize + "\t" +  PlanetMass + "\t" + PlanetPopulation + "\t" + AmountOfMoons + "\t" + TimeOfOrbitAroundSun + "\t" + DistanceFromSun + "\t" + PlanetTemp + "\t" + Gravity + "\t" + LengthOfDay;  
    }


    public Info(TableRow row)
    {
        PlanetName = row.getString("PlanetName");
        PlanetSize = row.getString("PlanetSize");
        PlanetMass = row.getString("PlanetMass");
        PlanetPopulation = row.getString("PlanetPopulation");
        AmountOfMoons = row.getString("AmountOfMoons");
        TimeOfOrbitAroundSun = row.getString("TimeOfOrbitAroundSun");
        DistanceFromSun = row.getString("DistanceFromSun");
        PlanetTemp = row.getString("PlanetTemp");
        Gravity = row.getString("Gravity");
        LengthOfDay = row.getString("LengthOfDay");
    }

    public Info()
    {
        
    }

}