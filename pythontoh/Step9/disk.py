from colorama import init
from colorama import Fore, Back, Style

init()
class Disk:
    def __init__(self, size, color):
        self.size = size
        self.color = color

    def get_size(self):
        return self.size
        
    def draw(self):
        print('                      ', end='')   # put some filler
        for x in range(1, self.size, 1):
            # by specifying end we are saying don't go the next line after print.
            print(self.color + 'X' , end='')
        # move the current cursor to the next line, so that our base will draw properly
        print(Fore.WHITE +'')   # put WHITE back so that it will reset to WHITE
