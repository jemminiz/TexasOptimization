function calcSav(char, sav, tough)
{
    var item = document.getElementById("text");
    if(char == "Leatherface")
    {
        item.innerHTML = "It would take " + (tough * 1.11 + 83.25) / (20 + (2.0/5 * sav - 10)) + " to kill someone with " + tough + " toughness at " + sav + " savagery on Leatherface.";
    }
    else if(char == "Cook")
    {
        item.innerHTML = "It would take " + (tough * 1.11 + 83.25) / (16 + (2.0/5 * sav - 10)) + " to kill someone with " + tough + " toughness at " + sav + " savagery on Cook.";
    }
    else if(char == "Sissy" || char == "Hitchhiker")
        item.innerHTML = "It would take " + (tough * 1.11 + 83.25) / (16 + (8.0/25 * sav - 8)) + " to kill someone with " + tough + " toughness at " + sav + " savagery on Sissy.";
    else if(char == "Hitchhiker")
        item.innerHTML = "It would take " + (tough * 1.11 + 83.25) / (16 + (8.0/25 * sav - 8)) + " to kill someone with " + tough + " toughness at " + sav + " savagery on Hitchhiker.";
    else
        item.innerHTML = "It would take " + (tough * 1.11 + 83.25) / (18 + (8.0/25 * sav - 8)) + " to kill someone with " + tough + " toughness at " + sav + " savagery on Johnny.";
}