class Disk:
    def __init__(self, size):
        self.size = size

    def draw(self):
        print('                      ', end='')   # put some filler
        for x in range(1, self.size, 1):
            # by specifying end we are saying don't go the next line after print.
            print('X', end='')
        # move the current cursor to the next line, so that our base will draw properly
        print('')
