s = "01:00:01AM"

if (s[-2:] == "PM"):
    x = int(s[:2])
    if (x == 12):
        return (s[:-2])
    else:
        y = x+12
        string = str(y)+s[2:-2]
        return (string)
else: 
    x = int(s[:2])
    if (x == 12):
        return ("00" + s[2:-2])
    else:
        return (s[:-2])