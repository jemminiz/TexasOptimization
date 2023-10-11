function calcSav(char, sav, tough)
{
    if(char == "Leatherface")
    {
        return (tough * 1.11 + 83.25) / (20 + (2.0/5 * sav - 10));
    }
    else if(char == "Cook")
    {
        return (tough * 1.11 + 83.25) / (16 + (2.0/5 * sav - 10));
    }
    else if(char == "Sissy" || char == "Hitchhiker")
        return (tough * 1.11 + 83.25) / (16 + (8.0/25 * sav - 8));
    else
        return (tough * 1.11 + 83.25) / (18 + (8.0/25 * sav - 8));
}