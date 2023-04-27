o = r"C:\\Users\\ezen\\Desktop\\web_full\\python\\test_file\\file01.file01.txt"
f = open(o,"r")
print(f, type(f))
line = f.read()
print(line)
f.close()